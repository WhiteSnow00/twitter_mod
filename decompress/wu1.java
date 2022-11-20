import java.util.Objects;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wu1 implements vu1
{
    public final tu1 a;
    
    public wu1(final tu1 a) {
        czd.f((Object)a, "bceMetadataDispatcher");
        this.a = a;
    }
    
    public final void a(final View view, final String s) {
        czd.f((Object)view, "view");
        if (s != null) {
            this.j(view, new ou1(s));
        }
    }
    
    public final void j(final View view, final ou1 ou1) {
        czd.f((Object)view, "view");
        if (vkr.V((CharSequence)ou1.a) ^ true) {
            final tu1 a = this.a;
            final uam uam = new uam(view, ou1);
            Objects.requireNonNull(a);
            a.F0.onNext((Object)uam);
        }
    }
}
