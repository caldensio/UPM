from Genome import Genome
from Population import Population
import random
from SelectionOperator import SelectionOperator


class SOperator(SelectionOperator):

    def __init__(self, population_list):
        self.population_list = population_list

    def apply(self, target_vector):
        j = random.randint(0, len(self.population_list)-1)
        while j == target_vector.get_id():
            j = random.randint(0, len(self.population_list)-1)
        k = random.randint(0, len(self.population_list)-1)
        while k == target_vector.get_id() or k == j:
            k = random.randint(0, len(self.population_list)-1)
        m = random.randint(0, len(self.population_list)-1)
        while m == target_vector.get_id() or m == k or m == j:
            m = random.randint(0, len(self.population_list)-1)
        n = random.randint(0, len(self.population_list)-1)
        while n == target_vector.get_id() or n == k or n == j or n == m:
            n = random.randint(0, len(self.population_list)-1)
        x1 = self.population_list[j]
        x2 = self.population_list[k]
        x3 = self.population_list[m]
        x4 = self.population_list[n]
        return target_vector, x1, x2, x3, x4
