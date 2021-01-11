from abc import ABC, abstractmethod


class MutationOperator(ABC):

    @abstractmethod
    def apply(self):
        pass