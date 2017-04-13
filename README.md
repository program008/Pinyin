# Pinyin3
1.主要功能是解决项目中语音识别出现的多音字同音字等问题，其主要的方案就是把对比的对象都变成拼音，然后进行相应的模糊规则进行识别
2.依赖添加步骤
Step 1. Add the JitPack repository to your build file
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  Step 2. Add the dependency
  dependencies {
	        compile 'com.github.program008:Pinyin3:v1.0'
	}




