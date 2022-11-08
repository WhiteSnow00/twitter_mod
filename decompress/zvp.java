import android.content.Context;
import android.widget.TextView;
import android.widget.ProgressBar;
import android.widget.Button;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zvp
{
    public final u3s a;
    public final u3s b;
    public final u3s c;
    public final u3s d;
    public final u3s e;
    public final u3s f;
    
    public zvp(final rtp rtp) {
        zzd.f((Object)rtp, "viewProvider");
        this.a = (u3s)rp2.z0((otb)new otb<ImageView>() {
            public final Object invoke() {
                return rtp.c().getView().findViewById(2131432354);
            }
        });
        this.b = (u3s)rp2.z0((otb)new otb<Button>() {
            public final Object invoke() {
                return rtp.c().getView().findViewById(2131431472);
            }
        });
        this.c = (u3s)rp2.z0((otb)new otb<ProgressBar>() {
            public final Object invoke() {
                return rtp.c().getView().findViewById(2131429846);
            }
        });
        this.d = (u3s)rp2.z0((otb)new otb<TextView>() {
            public final Object invoke() {
                return rtp.c().getView().findViewById(2131432073);
            }
        });
        this.e = (u3s)rp2.z0((otb)new otb<TextView>() {
            public final Object invoke() {
                return rtp.c().getView().findViewById(2131431798);
            }
        });
        this.f = (u3s)rp2.z0((otb)new otb<Context>() {
            public final Object invoke() {
                return rtp.c().getView().getContext();
            }
        });
    }
    
    public final Context a() {
        final Object value = this.f.getValue();
        zzd.e(value, "<get-context>(...)");
        return (Context)value;
    }
}
