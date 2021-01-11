from Genome import Genome
from Population import Population
from Operator import Operator
import random
from SelectionOperator import SelectionOperator


class SOperator(SelectionOperator):

    def __init__(self, population_list):
        self.population_list = population_list

    def apply(self, target_vector):
        j = random.randint(0, len(self.population_list)-1)
        while j==target_vector.get_id():
            j=random.randint(0, len(self.population_list)-1)
        k=random.randint(0, len(self.population_list)-1)
        while k==target_vector.get_id() or k == j:
            k = random.randint(0, len(self.population_list))
        x1 = self.population_list[j]
        x2 = self.population_list[k]
        return target_vector, x1, x2
