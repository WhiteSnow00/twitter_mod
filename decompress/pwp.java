import android.content.Context;
import android.widget.TextView;
import android.widget.ProgressBar;
import android.widget.Button;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pwp
{
    public final n4s a;
    public final n4s b;
    public final n4s c;
    public final n4s d;
    public final n4s e;
    public final n4s f;
    
    public pwp(final iup iup) {
        czd.f((Object)iup, "viewProvider");
        this.a = (n4s)pps.n((nsb)new nsb<ImageView>(iup) {
            public final iup D0;
            
            public final Object invoke() {
                return this.D0.c().getView().findViewById(2131432357);
            }
        });
        this.b = (n4s)pps.n((nsb)new nsb<Button>(iup) {
            public final iup D0;
            
            public final Object invoke() {
                return this.D0.c().getView().findViewById(2131431475);
            }
        });
        this.c = (n4s)pps.n((nsb)new nsb<ProgressBar>(iup) {
            public final iup D0;
            
            public final Object invoke() {
                return this.D0.c().getView().findViewById(2131429846);
            }
        });
        this.d = (n4s)pps.n((nsb)new nsb<TextView>(iup) {
            public final iup D0;
            
            public final Object invoke() {
                return this.D0.c().getView().findViewById(2131432076);
            }
        });
        this.e = (n4s)pps.n((nsb)new nsb<TextView>(iup) {
            public final iup D0;
            
            public final Object invoke() {
                return this.D0.c().getView().findViewById(2131431801);
            }
        });
        this.f = (n4s)pps.n((nsb)new nsb<Context>(iup) {
            public final iup D0;
            
            public final Object invoke() {
                return this.D0.c().getView().getContext();
            }
        });
    }
    
    public final Context a() {
        final Object value = this.f.getValue();
        czd.e(value, "<get-context>(...)");
        return (Context)value;
    }
}
