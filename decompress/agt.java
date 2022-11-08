import androidx.recyclerview.widget.RecyclerView$e;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agt extends gue implements rtb<igt, oyv>
{
    public final /* synthetic */ uft C0;
    
    public agt(final uft c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final igt igt = (igt)o;
        zzd.f((Object)igt, "$this$distinct");
        final LayoutInflater from = LayoutInflater.from(this.C0.C0.getContext());
        final View viewById = this.C0.C0.findViewById(2131432104);
        zzd.e((Object)viewById, "rootView.findViewById(R.\u2026toggle_wrapper_container)");
        final LinearLayout linearLayout = (LinearLayout)viewById;
        final int n = agt.agt$a.a[((Enum)igt.d).ordinal()];
        RecyclerView$e adapter = null;
        Integer value;
        if (n == 1) {
            value = 2131625098;
        }
        else {
            bl0.B("invalid toggle wrapper style provided");
            value = null;
        }
        final RecyclerView h0 = this.C0.H0;
        if (h0 != null) {
            adapter = h0.getAdapter();
        }
        ((ViewGroup)linearLayout).removeAllViewsInLayout();
        if (value != null) {
            from.inflate(value.intValue(), (ViewGroup)linearLayout, true);
        }
        final uft c0 = this.C0;
        c0.H0 = (RecyclerView)c0.C0.findViewById(2131428448);
        final RecyclerView h2 = this.C0.H0;
        if (h2 != null) {
            h2.setAdapter(adapter);
        }
        return oyv.a;
    }
}
