package com.directmedia.onlinestore.core.entity;

import java.util.HashSet;
import java.util.Set;

public class ShoppingCart
{
    private Set<Work> caddy = new HashSet<Work>();

    public ShoppingCart()
    {
    }

    public Set<Work> getCaddy()
    {
        return caddy;
    }

    public void setCaddy( Set<Work> caddy )
    {
        this.caddy = caddy;
    }
}
