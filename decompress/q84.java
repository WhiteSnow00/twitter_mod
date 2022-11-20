import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q84 extends nk8
{
    public final dej E0;
    public final View F0;
    public final o92 G0;
    public final a7m H0;
    public final TextView I0;
    public final View J0;
    public View K0;
    public final TextView L0;
    public final ViewGroup M0;
    public final EditText N0;
    public final TextView O0;
    public final View P0;
    public final acs Q0;
    
    public q84(final LayoutInflater layoutInflater, final dej e0, final acs q0, final ezb ezb) {
        final View inflate = layoutInflater.inflate(2131625048, (ViewGroup)null);
        super(inflate);
        this.E0 = e0;
        this.Q0 = q0;
        this.F0 = inflate;
        this.I0 = (TextView)inflate.findViewById(2131428653);
        final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(2131428237);
        ((View)recyclerView).getContext();
        recyclerView.setLayoutManager((RecyclerView$m)new LinearLayoutManager(1));
        this.G0 = new o92(inflate);
        final a7m h0 = new a7m(layoutInflater.getContext(), recyclerView);
        this.H0 = h0;
        final View inflate2 = layoutInflater.inflate(2131625049, (ViewGroup)null);
        this.J0 = inflate2;
        this.L0 = (TextView)inflate2.findViewById(2131431297);
        ezb.b(h0, (nsb)new p84((Object)this, (Object)ezb, 0));
        this.M0 = (ViewGroup)inflate.findViewById(2131429202);
        this.N0 = (EditText)inflate.findViewById(2131431271);
        this.O0 = (TextView)inflate.findViewById(2131428931);
        this.P0 = inflate2.findViewById(2131429418);
    }
    
    public final void l0(final TextView textView, final oxm oxm) {
        if (oxm != null) {
            this.E0.a(textView, oxm);
        }
        else {
            ((View)textView).setVisibility(8);
        }
    }
    
    public final void m0(final boolean b) {
        if (b) {
            ((View)this.M0).setVisibility(0);
            this.J0.setVisibility(8);
            final View k0 = this.K0;
            if (k0 != null) {
                k0.setVisibility(8);
            }
            ((View)this.N0).requestFocus();
            pcx.x((View)this.N0, true);
        }
        else {
            ((TextView)this.N0).setText((CharSequence)"");
            ((View)this.M0).setVisibility(8);
            this.J0.setVisibility(0);
            final View k2 = this.K0;
            if (k2 != null) {
                k2.setVisibility(0);
            }
            pcx.x((View)this.N0, false);
        }
        this.H0.B(new omf(0, 0), false);
    }
}
