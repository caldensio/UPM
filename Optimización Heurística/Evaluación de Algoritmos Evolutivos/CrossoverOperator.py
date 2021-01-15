from abc import ABC, abstractmethod


class CrossoverOperator(ABC):

    @abstractmethod
    def apply(self):
        pass