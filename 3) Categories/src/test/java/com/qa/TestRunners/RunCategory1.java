package com.qa.TestRunners;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.qa.Categories.CategoryOne;
import com.qa.Tests.TestClass1;
import com.qa.Tests.TestClass2;
import com.qa.Tests.TestClass3;

@RunWith(Categories.class)
@IncludeCategory(CategoryOne.class)
@SuiteClasses({TestClass1.class, TestClass2.class, TestClass3.class})

public class RunCategory1 {

}
