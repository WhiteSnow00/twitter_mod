// 
// Decompiled by Procyon v0.6.0
// 

public final class dbs implements cbs
{
    public final gcm a;
    
    public dbs(final gcm a) {
        e0e.f((Object)a, "requestRepository");
        this.a = a;
    }
    
    public final laj a(final Class clazz) {
        return (laj)new bbs(clazz, this.a, clazz.getSimpleName(), (wg8)null);
    }
    
    public final <RequestT extends pnm<?, ?>> laj<RequestT> b(final Class<RequestT> clazz, final String s) {
        return (laj<RequestT>)new bbs((Class)clazz, this.a, s, (wg8)null);
    }
}
