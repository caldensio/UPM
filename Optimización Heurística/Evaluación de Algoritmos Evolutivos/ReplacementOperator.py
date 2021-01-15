from abc import ABC, abstractmethod


class ReplacementOperator(ABC):

    @abstractmethod
    def apply(self):
        pass