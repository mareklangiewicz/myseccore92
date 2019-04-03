package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTestsMacosx {
    @Test
    fun testHello() {
        assertTrue("MacOSX" in hello())
    }
}