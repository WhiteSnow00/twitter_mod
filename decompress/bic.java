// 
// Decompiled by Procyon v0.6.0
// 

public final class bic extends rp1
{
    public boolean connected;
    
    public bic(final String s) {
        long long1;
        try {
            long1 = Long.parseLong(s);
        }
        catch (final Exception ex) {
            long1 = 0L;
        }
        this.connected = (long1 >= 0L);
    }
    
    @Override
    public final String a(final String s) {
        long long1;
        try {
            long1 = Long.parseLong(s);
        }
        catch (final Exception ex) {
            long1 = 0L;
        }
        long n;
        if (this.connected) {
            n = long1 + 1L;
        }
        else {
            n = long1 - 1L;
        }
        return String.valueOf(n);
    }
    
    @Override
    public final boolean b(final v2c v2c) {
        final boolean connected = this.connected;
        final au8 au8 = (au8)v2c.D0;
        if (au8.areHeadphonesActive == null) {
            au8.areHeadphonesActive = hu8.a(((vlj)v2c.E0).i);
        }
        if (connected != ((au8)v2c.D0).areHeadphonesActive) {
            nza.x1(" \u2716\ufe0e\ufe0e Headphones signal not matching");
            return false;
        }
        return true;
    }
    
    @Override
    public final int d() {
        return 24;
    }
}
