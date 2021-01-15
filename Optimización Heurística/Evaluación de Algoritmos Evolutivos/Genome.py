ID = 1


def aumentar_id():
    global ID
    ID += 1


class Genome(object):

    def __init__(self, genes):
        global ID
        self.id = ID
        aumentar_id()
        self.genes = genes
        self.score = None

    def get_id(self):
        return self.id

    def set_score(self, new_score):
        self.score = new_score

    def get_score(self):
       return float(self.score)

    def get_genes(self):
        return self.genes