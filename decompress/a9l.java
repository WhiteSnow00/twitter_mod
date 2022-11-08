import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a9l
{
    public final mbi<?> a;
    public final fxe<v9l> b;
    public final aqw c;
    public final View d;
    public final e9l e;
    public final z3l f;
    
    public a9l(final mbi<?> a, final fxe<v9l> b, final aqw c, final View d, final e9l e, final z3l f) {
        zzd.f((Object)a, "navigator");
        zzd.f((Object)b, "profileHeaderListeners");
        zzd.f((Object)c, "verificationEducationDialogPresenter");
        zzd.f((Object)f, "categorySheetLauncher");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static final class a implements bra<View, a9l>
    {
        public final mbi<?> a;
        public final fxe<v9l> b;
        public final aqw c;
        public final bra<jev, de6> d;
        public final z3l e;
        
        public a(final mbi<?> a, final fxe<v9l> b, final aqw c, final bra<jev, de6> d, final z3l e) {
            zzd.f((Object)a, "navigator");
            zzd.f((Object)b, "profileHeaderListeners");
            zzd.f((Object)c, "verificationEducationDialogPresenter");
            zzd.f((Object)d, "richTextProcessorFactory");
            zzd.f((Object)e, "categorySheetLauncher");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        public final a9l f(final View view) {
            zzd.f((Object)view, "profileHeaderLayout");
            final View viewById = view.findViewById(2131430770);
            zzd.e((Object)viewById, "profileHeaderLayout.find\u2026.id.profile_user_details)");
            return new a9l(this.a, this.b, this.c, viewById, new e9l(view, this.d), this.e);
        }
    }
}
