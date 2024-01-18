import pandas
dataframe = pandas.read_excel("../resources/name.xlsx", sheet_name='Sheet1')
print(dataframe)
print(dataframe["FirstName"][1])
