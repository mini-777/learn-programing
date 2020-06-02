import unittest #unittest import 시키기

# class TestStringMethod(unittest.TestCase):
#     def test_upper(self):
#         self.assertEqual('APPLE', 'apple' .upper()) #대문자화 시켜서 같은지 확인
#     def test_lower(self):
#         self.assertEqual('apple', 'Apple' .lower()) #소문자화 시켜서 같은지 확인
#     def test_isupper(self):
#         self.assertTrue('SKY' .isupper())   #조건이 True 인지 테스트  
#         self.assertFalse('Sky' .isupper()) #조건이 False 인지 테스트
#     def test_isupper(self):
#         self.assertTrue('sky' .islower()) 
#         self.assertFalse('Sky' .islower())
#     def test_split(self):
#         s='Hi Class' #변수 s 에 문자열 대입
#         self.assertEqual(s.split(), ['Hi', 'Class']) #문자열을 띄어쓰기 기준으로 나눈값과 배열값이 같은지 확인
#         with self.assertRaises(TypeError): #typeerror 가 발생했는지 확인
#             s.split(2)
# if __name__=="__main__":
#     unittest.main()    
def add(a, b):
    return a+b
def substract(a, b):
    return a-b
def division(a, b):
    return a/b
def multiply(a,b):
    return a*b
class TddTest(unittest.TestCase):

    aa = 0
    bb = 0
    result = 0

    # 매 테스트 메소드 실행 전 동작
    def setUp(self):
        self.aa = 10
        self.bb = 20

    def testAdd(self):
        self.result = add(self.aa, self.bb)

        # 결과 값이 일치 여부 확인
        self.assertEqual(self.result, 31)

    def testSubstract(self):
        self.result = substract(self.aa, self.bb)

        if self.result > 10:
            boolval = True
        else:
            boolval = False

        # 결과 값이 True 여부 확인
        self.assertTrue(boolval)

    def testDivision(self):
        # 결과 값이 ZeroDivisionError 예외 발생 여부 확인
        self.assertRaises(ZeroDivisionError, division, 4, 1)

    def testMultiply(self):
        nonechk = True

        self.result = multiply(10, 9)

        if self.result > 100:
            nonechk = None

        # 결과 값이 None 여부 확인
        self.assertIsNone(nonechk)

    # 매 테스트 메소드 실행 후 동작
    def tearDown(self):
        print(' 결과 값 : ' + str(self.result))

if __name__ == '__main__':
    unittest.main()