package edu.iis.mto.bsearch;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class BinarySearchTest {

    int list[];
    SearchResult searchResult;

    @BeforeEach
    void setUp() throws Exception {
        searchResult = new SearchResult();
    }

    @Test
    void singleElmExistsInSeq() {
        list = new int[]{5};
        searchResult.setPosition(1);
        assertThat(BinarySearch.search(5, list), Matchers.equalTo(searchResult));
    }

}
