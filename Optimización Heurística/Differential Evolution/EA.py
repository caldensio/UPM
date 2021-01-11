from Population import Population
from SOperator import SOperator
from ROperator import ROperator
from COperator import COperator
from MOperator import MOperator




def f(n):
    return sum(n)


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
        pop = Population(self.psize, self.bounds,self.minfun)
        for i in pop.get_population():
            self.evaluate(i)
        print("La población inicial es: \n")
        for i in pop.get_population():
            print("El candidato: " + str(i.get_id()) + " tiene los genes: " + str(
                i.get_genes()) + " y su fitness es: " + str(i.get_score()))
        print("\n")
        while iteraciones > 0:
            # Llamada al operador de seleccion
            target_vector = self.best(pop)
            selection_res = SOperator(pop.get_population()).apply(target_vector)
            # Llamada al operador de mutacion
            mutant_vector = MOperator(pop.get_population(),mybounds).apply(selection_res[0])
            self.evaluate(mutant_vector)
            print("El mutant vector es: " + str(mutant_vector.get_genes()) + " y su fitness es: "
                  + str(mutant_vector.get_score()) + " Id del mutant vector actual: " + str(mutant_vector.get_id()))
            # Llamada al operador de crossover
            trial_vector = COperator(pop.get_population(),mybounds).apply(mutant_vector, target_vector, 0)
            self.evaluate(trial_vector)
            print("El trial vector es: " + str(trial_vector.get_genes()) + " y su fitness es: "
                  + str(trial_vector.get_score()) + " Id del trial vector actual: " + str(trial_vector.get_id()))
            print("El mejor candidato actual es: " + str(target_vector.get_genes()) + " cuyo fitness es: " + str(
                target_vector.get_score()) + "\n")
            pop = ROperator(pop.get_population()).apply(target_vector, trial_vector, pop)
            iteraciones = iteraciones - 1
        best = self.best(pop)
        print("El mejor candidato ha sido: " + str(best.get_genes()) + " cuyo fitness es: " + str(best.get_score()))


mybounds = [(0, 2), (0, 2), (0, 2)]
myEA = EA(f, mybounds, 100)
myEA.run(10)