#include <jni.h>
#include <string>


extern "C" JNIEXPORT jdouble JNICALL
Java_com_example_simplecalculator_MainActivity_add(
        JNIEnv* env,
        jobject obj,jdouble a , jdouble b/* this */) {
    return a+b;
}
extern "C" JNIEXPORT jdouble JNICALL
Java_com_example_simplecalculator_MainActivity_sub(
        JNIEnv* env,
        jobject obj,jdouble a , jdouble b/* this */) {
    return a-b;
}
extern "C" JNIEXPORT jdouble JNICALL
Java_com_example_simplecalculator_MainActivity_mul(
        JNIEnv* env,
        jobject obj,jdouble a , jdouble b/* this */) {
    return a*b;
}
extern "C" JNIEXPORT jdouble JNICALL
Java_com_example_simplecalculator_MainActivity_div(
        JNIEnv* env,
        jobject obj,jdouble a , jdouble b/* this */) {
    if (b==0) return 0;
    return a/b;
}