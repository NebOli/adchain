package com.adchain;

/**
 * Created by Gust on 19.12.2017.
 */
public interface AdChainListener {
    //    void lastAdClosed();
//    void penultimateAdClosed();
    void adCompleted(int order, int total, boolean isLastAd);
}
