from Population import Population
from SOperator import SOperator
from ROperator import ROperator
from COperator import COperator
from MOperator import MOperator
from benchmarks import functions
from scipy.optimize import differential_evolution
import statistics


def f(n):
    return functions.schaffer(n)


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
        pop = Population(self.psize, self.bounds, self.minfun)
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


bounds = [(0, 10)]*10
myEA = EA(f, bounds, 10)

lista_de = []
lista_scipy = []
for i in range(0, 10):
    best = myEA.run(100)
    scipy_de = differential_evolution(f, bounds, strategy='best2bin',
                                      popsize=10, maxiter=50, recombination=0.5)
    lista_de.append(best.get_score())
    lista_scipy.append(scipy_de.fun)
    print('* **Nuestra implementación:** {0}   '"\n"
          '* **Fitness de nuestra implementación:** {1}'"\n"
          '* **Implementación Scipy:**   {2}'"\n"
          '* **Fitness de la implementación de Scipy:** {3}'"\n".format(str(best.get_genes()), str(best.get_score()), scipy_de.x,
                                                    str(scipy_de.fun)))
    print("\n")


print("* **Media de nuestra implementación:** " + str(statistics.mean(lista_de)))
print("* **Media de la implementación de Scipy** " + str(statistics.mean(lista_scipy)))
print("* **Desviación típica de nuestra implementación:** " + str(statistics.stdev(lista_de)))
print("* **Desviación típica de la implementación de Scipy:** " + str(statistics.stdev(lista_scipy)))
print("* **Mediana de nuestra implementación:** " + str(statistics.median(lista_de)))
print("* **Mediana de la implementación de Scipy:** " + str(statistics.median(lista_scipy)))
print("* **Min de nuestra implementación:** " + str(statistics.quantiles(lista_de, n=len(lista_de)+1)[0]))
print("* **Min de la implementación de Scipy:** " + str(statistics.quantiles(lista_scipy, n=len(lista_scipy)+1)[0]))
print("* **Max de nuestra implementacion:** " + str(statistics.quantiles(lista_de, n=len(lista_de)+1)[len(lista_de)-1]))
print("* **Max de la implementación de Scipy:** " + str(statistics.quantiles(lista_scipy, n=len(lista_scipy)+1)[len(lista_scipy)-1]))


