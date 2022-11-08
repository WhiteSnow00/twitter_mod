// 
// Decompiled by Procyon v0.6.0
// 

public final class p32 extends gue implements rtb<Integer, oyv>
{
    public final /* synthetic */ rz5 C0;
    
    public p32(final rz5 c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Integer n = (Integer)o;
        final StringBuilder sb = new StringBuilder();
        sb.append("stored: ");
        sb.append(n);
        cag.a("BlockstoreRepositoryImpl", sb.toString());
        ((nz5$a)this.C0).a();
        return oyv.a;
    }
}
