// 
// Decompiled by Procyon v0.6.0
// 

public final class o2c implements w9r
{
    public final rcs<String> a;
    
    public o2c(final rcs<String> a) {
        this.a = a;
    }
    
    @Override
    public final boolean a(final Exception ex) {
        return false;
    }
    
    @Override
    public final boolean b(final i8k i8k) {
        if (i8k.f() != 3 && !i8k.j() && !i8k.h()) {
            return false;
        }
        this.a.d(i8k.c());
        return true;
    }
}
