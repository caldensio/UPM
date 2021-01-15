from Genome import Genome
import random


class Population(object):

    def __init__(self, psize, bounds):
        self.population_list = []

        i = 0
        while i < psize:
            genes = []
            for j in bounds:
                genes.append(random.uniform(j[0], j[1]))
            new_genome = Genome(genes)
            self.population_list.append(new_genome)
            i = i + 1

    def get_population(self):
        return self.population_list

    def ascendant_sort(self):
        self.population_list = sorted(self.population_list, key=lambda x: x.score)

    def descendant_sort(self):
        self.population_list = sorted(self.population_list, key=lambda x: x.score, reverse=True)

    def replace_genome(self, old_genome, new_genome):
        pos = self.population_list.index(old_genome)
        self.population_list.insert(pos, new_genome)
        self.population_list.remove(old_genome)