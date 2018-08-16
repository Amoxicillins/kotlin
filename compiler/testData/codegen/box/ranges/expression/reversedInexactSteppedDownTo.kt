// TODO: muted automatically, investigate should it be ran for JS_IR or not
// IGNORE_BACKEND: JS_IR

// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME



fun box(): String {
    val list1 = ArrayList<Int>()
    val range1 = (8 downTo 3 step 2).reversed()
    for (i in range1) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<Int>(4, 6, 8)) {
        return "Wrong elements for (8 downTo 3 step 2).reversed(): $list1"
    }

    val list2 = ArrayList<Int>()
    val range2 = (8.toByte() downTo 3.toByte() step 2).reversed()
    for (i in range2) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<Int>(4, 6, 8)) {
        return "Wrong elements for (8.toByte() downTo 3.toByte() step 2).reversed(): $list2"
    }

    val list3 = ArrayList<Int>()
    val range3 = (8.toShort() downTo 3.toShort() step 2).reversed()
    for (i in range3) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<Int>(4, 6, 8)) {
        return "Wrong elements for (8.toShort() downTo 3.toShort() step 2).reversed(): $list3"
    }

    val list4 = ArrayList<Long>()
    val range4 = (8L downTo 3L step 2L).reversed()
    for (i in range4) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<Long>(4, 6, 8)) {
        return "Wrong elements for (8L downTo 3L step 2L).reversed(): $list4"
    }

    val list5 = ArrayList<Char>()
    val range5 = ('d' downTo 'a' step 2).reversed()
    for (i in range5) {
        list5.add(i)
        if (list5.size > 23) break
    }
    if (list5 != listOf<Char>('b', 'd')) {
        return "Wrong elements for ('d' downTo 'a' step 2).reversed(): $list5"
    }

    val list6 = ArrayList<UInt>()
    val range6 = (8u downTo 3u step 2).reversed()
    for (i in range6) {
        list6.add(i)
        if (list6.size > 23) break
    }
    if (list6 != listOf<UInt>(4u, 6u, 8u)) {
        return "Wrong elements for (8u downTo 3u step 2).reversed(): $list6"
    }

    val list7 = ArrayList<UInt>()
    val range7 = (8u.toUByte() downTo 3u.toUByte() step 2).reversed()
    for (i in range7) {
        list7.add(i)
        if (list7.size > 23) break
    }
    if (list7 != listOf<UInt>(4u, 6u, 8u)) {
        return "Wrong elements for (8u.toUByte() downTo 3u.toUByte() step 2).reversed(): $list7"
    }

    val list8 = ArrayList<UInt>()
    val range8 = (8u.toUShort() downTo 3u.toUShort() step 2).reversed()
    for (i in range8) {
        list8.add(i)
        if (list8.size > 23) break
    }
    if (list8 != listOf<UInt>(4u, 6u, 8u)) {
        return "Wrong elements for (8u.toUShort() downTo 3u.toUShort() step 2).reversed(): $list8"
    }

    val list9 = ArrayList<ULong>()
    val range9 = (8uL downTo 3uL step 2L).reversed()
    for (i in range9) {
        list9.add(i)
        if (list9.size > 23) break
    }
    if (list9 != listOf<ULong>(4u, 6u, 8u)) {
        return "Wrong elements for (8uL downTo 3uL step 2L).reversed(): $list9"
    }

    return "OK"
}
