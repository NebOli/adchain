package com.adchain;

/**
 * Created by Gust on 19.12.2017.
 */
public interface IAdChain {
    void setNextAd(IAdChain nextAdChain);

    void startChain();

    void timeout();

    void destroyChain();

    void initChain();

}
