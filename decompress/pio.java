import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pio implements fzt, s01
{
    public static final pio.pio$a Companion;
    public final oko a;
    public final gcu b;
    public final xnl<azt> c;
    
    static {
        Companion = new pio.pio$a();
    }
    
    public pio(final oko a, final gcu b) {
        e0e.f((Object)a, "roomsScribeReporter");
        e0e.f((Object)b, "preferences");
        this.a = a;
        this.b = b;
        this.c = (xnl<azt>)new xnl();
    }
    
    public final t5j<azt> a() {
        final xnl<azt> c = this.c;
        Objects.requireNonNull(c);
        final t5j map = t5j.combineLatest((fbj)new d8j((bol)c), (fbj)this.b.a().filter((ouk)new cu1((stb)new qio(), 15)).map((rtb)new l5i((stb)rio.F0, 21)).startWith((Object)(this.b.e("room_transcription_display", false) || this.b.e("room_transcription_display_autoplay", false))).doOnNext((rk6)new cyt((stb)new sio(this), 24)), (hw1)new f8f(tio.F0, 3)).filter((ouk)new kzf((stb)uio.F0, 17)).map((rtb)new wsn((stb)vio.F0, 4));
        e0e.e((Object)map, "relay.toObservable().fil\u2026N_SHOW_AUTOPLAY\n        )");
        return (t5j<azt>)map;
    }
}
