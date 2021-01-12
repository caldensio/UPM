from Population import Population
from SOperator import SOperator
from ROperator import ROperator
from COperator import COperator
from MOperator import MOperator
from benchmarks import functions
from scipy.optimize import differential_evolution


def f(n):
    return functions.ackley(n)


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
            trial_vector = COperator(pop.get_population(), bounds).apply(mutant_vector, target_vector, 0)
            self.evaluate(trial_vector)
            pop = ROperator(pop.get_population()).apply(target_vector, trial_vector, pop)
            best = self.best(pop)
            print("El mejor candidato ha sido de la generacion " + str(contador + 1) + " ha sido: "
                  + str(best.get_genes()) + " cuyo fitness es: " + str(best.get_score()) + "\n")
            contador += 1


bounds = [(0, 1), (0, 1), (0, 1)]
myEA = EA(f, bounds, 10)
myEA.run(10)
scipy_de = differential_evolution(f, bounds, 10, maxiter=10)
print(scipy_de.x)
print()
print(scipy_de.fun)
