from Genome import Genome
from MutationOperator import MutationOperator
from SOperator import SOperator

F = 0.5   #Factor de mutacion


class MOperator(MutationOperator):

    def __init__(self, population_list,bounds):
        self.population_list = population_list
        self.bounds=bounds

    def apply(self, target_vector):
        genes = []
        res_SO = SOperator(self.population_list).apply(target_vector)
        x1 = res_SO[1]
        x2 = res_SO[2]
        global F
        for i in range(0, len(target_vector.genes)-1):
            max_bound = self.bounds[i][1]
            min_bound = self.bounds[i][0]
            res = target_vector.genes[i] + F * (x1.genes[i] - x2.genes[i])
            if res >= max_bound:
               res = max_bound
            if res <= min_bound:
                res = min_bound
            genes.append(res)
        vig = Genome(genes)
        return vig
