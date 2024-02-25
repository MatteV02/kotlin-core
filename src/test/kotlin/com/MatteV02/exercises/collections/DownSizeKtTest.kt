package com.MatteV02.exercises.collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class DownSizeKtTest : FunSpec({

    context("downsize") {
        val emptyListContent = listOf<String>()
        val mediumListContent =
            listOf("AKurx", "Yjpv5", "0qrUG", "Wv0jK", "N8GY8", "PAnCx", "kbbBi", "sZ4Z9", "i1wq8", "pIt2F")
        val lengthyListContent = listOf(
            "SkPmB",
            "qEAzu",
            "lemrz",
            "AKktQ",
            "qeHSp",
            "kSvUm",
            "ElzlI",
            "jsuJn",
            "xXzKi",
            "dpnXE",
            "FABUK",
            "oTRSv",
            "cEHed",
            "OrTKA",
            "SMBBh",
            "gqcoG",
            "kBUjK",
            "oyDIB",
            "CIkKi",
            "nXVje",
            "amwuF",
            "gTyzZ",
            "WNyRR",
            "AnJnP",
            "SOoYD",
            "lUEaj",
            "BfuhZ",
            "GLhEd",
            "TjLqO",
            "YBpfo",
            "rHHhp",
            "liPyj",
            "hWUoS",
            "VwOdt",
            "ncSec",
            "ZtPAV",
            "gdkgY",
            "UOOwd",
            "KNrFd",
            "AFEAJ",
            "aQfgE",
            "GXVkK",
            "RfYDw",
            "hSIqF",
            "RzJgr",
            "Eeuyh",
            "vibnH",
            "DkoEW",
            "zKpnt",
            "OQRvL",
            "LdWQL",
            "fHCCB",
            "tzAPU",
            "RcbuL",
            "YZIWO",
            "GomWs",
            "fcZhc",
            "UDzjO",
            "QLYFX",
            "PQBFm",
            "MOuxX",
            "Wsqvm",
            "EeilD",
            "ZlnpK",
            "dceLt",
            "XejDh",
            "ysOCv",
            "HPVWS",
            "bbkHE",
            "glNCb",
            "eFYBp",
            "oBnFq",
            "XBCJd",
            "pnEFT",
            "uCBGb",
            "qDNeL",
            "MEUjI",
            "dGwra",
            "UsFsa",
            "BAhiQ",
            "lHHHm",
            "kVLJz",
            "VATtX",
            "ZhJpF",
            "PSJPR",
            "dPvEa",
            "mkeQa",
            "elGDO",
            "yLBtl",
            "omrfS",
            "WrNXb",
            "zNhXn",
            "LuKmc",
            "AJcMG",
            "zdwOp",
            "XEfCT",
            "kYtvM",
            "AqQJl",
            "MAjMn",
            "OozJd"
        )

        var emptyList = mutableListOf<String>()
        var mediumList = mutableListOf<String>()
        var lengthyList = mutableListOf<String>()

        beforeEach {
            emptyList = emptyListContent.copy()
            mediumList = mediumListContent.copy()
            lengthyList = lengthyListContent.copy()
        }

        test("list.size < n") {
            downsize(emptyList, 1)
            emptyList shouldBe emptyList()

            downsize(mediumList, mediumList.size + 1)
            mediumList shouldBe mediumListContent
        }

        test("list.size >= n") {
            downsize(mediumList, mediumList.size)
            mediumList shouldBe mutableListOf(
                "AKurx",
                "Yjpv5",
                "0qrUG",
                "Wv0jK",
                "N8GY8",
                "PAnCx",
                "kbbBi",
                "sZ4Z9",
                "i1wq8"
            )

            mediumList = mediumListContent.copy()
            downsize(mediumList, 3)
            mediumList shouldBe mutableListOf("AKurx", "Yjpv5", "Wv0jK", "N8GY8", "kbbBi", "sZ4Z9", "pIt2F")

            downsize(lengthyList, 10)
            lengthyList shouldBe lengthyListContent.filterIndexed { index, _ -> (index + 1) % 10 != 0 }
        }

        test("n < 0") {
            downsize(emptyList, -1)
            emptyList shouldBe emptyList()

            downsize(mediumList, -1)
            mediumList shouldBe mutableListOf(
                "AKurx",
                "Yjpv5",
                "0qrUG",
                "Wv0jK",
                "N8GY8",
                "PAnCx",
                "kbbBi",
                "sZ4Z9",
                "i1wq8",
                "pIt2F"
            )

            downsize(lengthyList, -1)
            lengthyList shouldBe lengthyListContent
        }
    }

})

private fun <E> List<E>.copy(): MutableList<E> {
    val returnList = mutableListOf<E>()

    returnList.addAll(this)

    return returnList
}
