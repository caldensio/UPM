from Genome import Genome
from Population import Population
import random
from CrossoverOperator import CrossoverOperator


class COperator(CrossoverOperator):

    def __init__(self, population_list,bounds):
        self.population_list = population_list
        self.bounds = bounds

    def apply(self, mutant_vector, target_vector, Cr):
        genes = []
        for j in range(0, len(mutant_vector.get_genes())):
            randji = random.uniform(0, 1)
            Jrand = random.randint(0, len(mutant_vector.get_genes()))
            if randji <= Cr or j == Jrand:
                genes.append(mutant_vector.get_genes()[j])
            else:
                genes.append(target_vector.get_genes()[j])
        uig = Genome(genes)
        return uig

