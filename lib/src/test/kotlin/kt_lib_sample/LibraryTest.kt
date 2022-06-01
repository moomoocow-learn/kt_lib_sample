/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package kt_lib_sample

import kotlin.test.Test
import kotlin.test.*

class LibraryTest {
    @Test fun someLibraryMethodReturnsTrue() {
        val classUnderTest = Library()
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'")
    }

    @Test fun msgTest() {
        val classUnderTest = Library()
        assertEquals(classUnderTest.msg(), "msg=test", "test msg")
    }

    @Test fun libVersionTest() {
        val classUnderTest = Library()
        assertNotEquals(classUnderTest.libVersion(), "", "test msg")
    }
}
