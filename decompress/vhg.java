// 
// Decompiled by Procyon v0.6.0
// 

public final class vhg implements n93
{
    public final int a;
    public final Object b;
    
    public vhg(final Object b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Object o) {
        switch (this.a) {
            default: {
                final qmi qmi = (qmi)this.b;
                final Void void1 = (Void)o;
                czd.f((Object)qmi, "this$0");
                ((qpg)qmi.D0).onComplete();
                return;
            }
            case 0: {
                final whg whg = (whg)this.b;
                final hf9$d hf9$d = (hf9$d)o;
                whg.c();
            }
        }
    }
}
