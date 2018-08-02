// TODO: muted automatically, investigate should it be ran for JS_IR or not
// IGNORE_BACKEND: JS_IR

// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME


const val MaxI = Int.MAX_VALUE
const val MaxB = Byte.MAX_VALUE
const val MaxS = Short.MAX_VALUE
const val MaxL = Long.MAX_VALUE
const val MaxC = Char.MAX_VALUE
const val MaxUI = UInt.MAX_VALUE
const val MaxUL = ULong.MAX_VALUE

fun box(): String {
    val list1 = ArrayList<Int>()
    for (i in (MaxI - 2)..MaxI) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<Int>(MaxI - 2, MaxI - 1, MaxI)) {
        return "Wrong elements for (MaxI - 2)..MaxI: $list1"
    }

    val list2 = ArrayList<Int>()
    for (i in (MaxB - 2).toByte()..MaxB) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<Int>((MaxB - 2).toInt(), (MaxB - 1).toInt(), MaxB.toInt())) {
        return "Wrong elements for (MaxB - 2).toByte()..MaxB: $list2"
    }

    val list3 = ArrayList<Int>()
    for (i in (MaxS - 2).toShort()..MaxS) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<Int>((MaxS - 2).toInt(), (MaxS - 1).toInt(), MaxS.toInt())) {
        return "Wrong elements for (MaxS - 2).toShort()..MaxS: $list3"
    }

    val list4 = ArrayList<Long>()
    for (i in (MaxL - 2).toLong()..MaxL) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<Long>((MaxL - 2).toLong(), (MaxL - 1).toLong(), MaxL)) {
        return "Wrong elements for (MaxL - 2).toLong()..MaxL: $list4"
    }

    val list5 = ArrayList<Char>()
    for (i in (MaxC - 2)..MaxC) {
        list5.add(i)
        if (list5.size > 23) break
    }
    if (list5 != listOf<Char>((MaxC - 2), (MaxC - 1), MaxC)) {
        return "Wrong elements for (MaxC - 2)..MaxC: $list5"
    }

    val list6 = ArrayList<UInt>()
    for (i in (MaxUI - 2u)..MaxUI) {
        list6.add(i)
        if (list6.size > 23) break
    }
    if (list6 != listOf<UInt>(MaxUI - 2u, MaxUI - 1u, MaxUI)) {
        return "Wrong elements for (MaxUI - 2u)..MaxUI: $list6"
    }

    val list7 = ArrayList<ULong>()
    for (i in (MaxUL - 2u)..MaxUL) {
        list7.add(i)
        if (list7.size > 23) break
    }
    if (list7 != listOf<ULong>(MaxUL - 2u, MaxUL - 1u, MaxUL)) {
        return "Wrong elements for (MaxUL - 2u)..MaxUL: $list7"
    }

    return "OK"
}
