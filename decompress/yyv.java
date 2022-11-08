// 
// Decompiled by Procyon v0.6.0
// 

public final class yyv extends wp1
{
    public boolean unlocked;
    
    public yyv() {
    }
    
    public yyv(final String s) {
        long long1;
        try {
            long1 = Long.parseLong(s);
        }
        catch (final Exception ex) {
            long1 = 0L;
        }
        this.unlocked = (long1 >= 0L);
    }
    
    public final String a(final String s) {
        long long1;
        try {
            long1 = Long.parseLong(s);
        }
        catch (final Exception ex) {
            long1 = 0L;
        }
        long n;
        if (this.unlocked) {
            n = long1 + 1L;
        }
        else {
            n = long1 - 1L;
        }
        return String.valueOf(n);
    }
    
    public final boolean b(final mjr mjr) {
        if (this.unlocked != mjr.f()) {
            ck1.r(" \u2716\ufe0e\ufe0e Unlock signal not matching");
            return false;
        }
        return true;
    }
    
    public final int d() {
        return 49;
    }
}
