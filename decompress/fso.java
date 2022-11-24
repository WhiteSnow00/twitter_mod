import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fso implements xlx
{
    public final k9x F0;
    public final TextView G0;
    
    public fso(View viewById, final k9x f0) {
        e0e.f((Object)viewById, "rootView");
        e0e.f((Object)f0, "lifecycle");
        this.F0 = f0;
        viewById = viewById.findViewById(2131431174);
        e0e.e((Object)viewById, "rootView.findViewById(R.\u2026.sample_header_text_view)");
        this.G0 = (TextView)viewById;
    }
    
    public final void T(final ccx ccx) {
        final hso hso = (hso)ccx;
        e0e.f((Object)hso, "state");
        this.G0.setText((CharSequence)hso.a);
    }
    
    public final void r(final Object o) {
    }
    
    public final t5j w() {
        return ffe.b();
    }
}
