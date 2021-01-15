from Population import Population
from SOperator import SOperator
from ROperator import ROperator
from COperator import COperator
from MOperator import MOperator
from benchmarks import functions as benchmark
from scipy.optimize import differential_evolution
from scipy.stats import kruskal, friedmanchisquare
import pyade.sade as pyade
import statistics
import numpy


def f(n):
    return benchmark.schaffer(n)


class EA(object):
    """docstring for EA"""

    def __init__(self, minfun, bounds, psize):
        self.minfun = minfun
        self.bounds = bounds
        self.psize = psize

    def best(self, population):
        population.ascendant_sort()
        best = population.get_population()[0]
        return best

    def evaluate(self, genome):
        genome.set_score(self.minfun(genome.get_genes()))

    def run(self, iteraciones):
        # Inicializacion de la poblacion
        pop = Population(self.psize, self.bounds)
        for i in pop.get_population():
            self.evaluate(i)
        contador = 0
        while contador < iteraciones:
            target_vector = self.best(pop)
            mutant_vector = MOperator(pop.get_population(), bounds).apply(target_vector)
            self.evaluate(mutant_vector)
            trial_vector = COperator(pop.get_population(), bounds).apply(mutant_vector, target_vector, 0.5)
            self.evaluate(trial_vector)
            pop = ROperator(pop.get_population()).apply(target_vector, trial_vector, pop)
            contador += 1
        winner = self.best(pop)
        return winner


bounds = [(0, 10)] * 10

total_medias_de = []
total_medias_scipy = []
total_medias_sade = []

benchmarks = [benchmark.sphere, benchmark.ackley, benchmark.rosenbrock, benchmark.rastrigin,
              benchmark.griewank, benchmark.schwefel_2_21, benchmark.schwefel_2_22,
              benchmark.schwefel_1_2, benchmark.extended_f_10, benchmark.bohachevsky,
              benchmark.schaffer]
for func in benchmarks:
    myEA = EA(func, bounds, 25)
    lista_de = []
    lista_scipy = []
    lista_sade = []
    for i in range(0, 10):
        best = myEA.run(100)
        best_scipy = differential_evolution(func, bounds, strategy='best2bin',
                                            popsize=25, maxiter=100, recombination=0.5)
        best_pyade = pyade.apply(population_size=25, individual_size=10, bounds=numpy.ndarray((10, 2)),
                                 func=func, opts=None, callback=None, max_evals=100, seed=None)[1]
        lista_de.append(best.get_score())
        lista_scipy.append(best_scipy.fun)
        lista_sade.append(best_pyade)

    print("Fitness de DE")
    for i in lista_de:
        print(i)
    print("\n")

    print("Estadísticas de DE")
    media_de = statistics.mean(lista_de)
    total_medias_de.append(media_de)
    print(str(media_de))
    print(str(statistics.stdev(lista_de)))
    print(str(statistics.median(lista_de)))
    print(str(statistics.quantiles(lista_de, n=len(lista_de) + 1)[0]))
    print(str(statistics.quantiles(lista_de, n=len(lista_de) + 1)[len(lista_de) - 1]) + "\n")

    print("Fitness de Scipy")
    for i in lista_scipy:
        print(i)
    print("\n")

    print("Estadísticas de Scipy")
    media_scipy = statistics.mean(lista_scipy)
    total_medias_scipy.append(media_scipy)
    print(str(media_scipy))
    print(str(statistics.stdev(lista_scipy)))
    print(str(statistics.median(lista_scipy)))
    print(str(statistics.quantiles(lista_scipy, n=len(lista_scipy) + 1)[0]))
    print(str(statistics.quantiles(lista_scipy, n=len(lista_scipy) + 1)[len(lista_scipy) - 1]) + "\n")

    print("Fitness de Pyade")
    for i in lista_sade:
        print(i)
    print("\n")

    print("Estadísticas de Pyade")
    media_sade = statistics.mean(lista_sade)
    total_medias_sade.append(media_sade)
    print(str(media_sade))
    print(str(statistics.stdev(lista_sade)))
    print(str(statistics.median(lista_sade)))
    print(str(statistics.quantiles(lista_sade, n=len(lista_sade) + 1)[0]))
    print(str(statistics.quantiles(lista_sade, n=len(lista_sade) + 1)[len(lista_sade) - 1]))

    res = kruskal(lista_de, lista_scipy, lista_sade)
    print("Resultados de Kruskal en la función " + str(func.__name__) + ": " + str(res))

res = friedmanchisquare(total_medias_de, total_medias_scipy, total_medias_sade)
print("Resultados de Friedman: " + str(res))
