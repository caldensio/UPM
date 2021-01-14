from abc import ABC, abstractmethod


class SelectionOperator(ABC):

    @abstractmethod
    def apply(self):
        pass

