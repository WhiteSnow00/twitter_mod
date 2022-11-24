import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d0g implements nuk
{
    public final int c;
    public final Set d;
    
    public d0g(final Set d, final int c) {
        this.c = c;
        this.d = d;
    }
    
    public final nuk a() {
        switch (this.c) {
            default: {
                return luk.a((nuk)this);
            }
            case 0: {
                return luk.a((nuk)this);
            }
        }
    }
    
    public final boolean apply(final Object o) {
        switch (this.c) {
            default: {
                final Set d = this.d;
                final ss4 ss4 = (ss4)o;
                final hmw a = ivs.a;
                return d.contains(ss4.b) ^ true;
            }
            case 0: {
                return this.d.contains(((ezw)o).i());
            }
        }
    }
}
