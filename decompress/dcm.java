// 
// Decompiled by Procyon v0.6.0
// 

public final class dcm extends gue implements gub<fto, luh<Object>, luh<Object>>
{
    public final /* synthetic */ dto<Object, Object> C0;
    
    public dcm(final dto<Object, Object> c0) {
        this.C0 = c0;
        super(2);
    }
    
    public final Object invoke(Object a, final Object o) {
        final fto fto = (fto)a;
        final luh luh = (luh)o;
        zzd.f((Object)fto, "$this$Saver");
        zzd.f((Object)luh, "state");
        if (luh instanceof mhq) {
            a = this.C0.a(fto, luh.getValue());
            final ohq a2 = ((mhq)luh).a();
            zzd.d((Object)a2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
            return nkz.q(a, a2);
        }
        throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
    }
}
