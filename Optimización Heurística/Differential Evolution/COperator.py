from Genome import Genome
from Population import Population
import random
from CrossoverOperator import CrossoverOperator


class COperator(CrossoverOperator):

    def __init__(self, population_list,bounds):
        self.population_list = population_list
        self.bounds=bounds

    def apply(self, mutant_vector, target_vector, Cr):
        genes = []
        for j in range(0, len(mutant_vector.genes)):
            max_bounds = self.bounds[j][1]
            min_bound = self.bounds[j][0]
            res = target_vector.get_genes()[j] + Cr  * (mutant_vector.get_genes()[j] - target_vector.get_genes()[j])
            if res >= max_bounds:
                res = max_bounds
            if res <= min_bound:
                res = min_bound
            genes.append(res)
            genes.append(res)
        uig = Genome(genes)
        return uig

