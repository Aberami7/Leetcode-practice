class Solution(object):
    def runningSum(self, nums):

      
       a=nums[0]
       for i in range(len(nums)-1):
            a+=nums[i+1]
            nums[i+1]=a
       return nums