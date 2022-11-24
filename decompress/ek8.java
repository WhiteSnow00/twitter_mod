import android.os.Looper;
import android.content.Intent;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.g;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink$g;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.util.Objects;
import android.provider.Settings$Global;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.google.android.exoplayer2.audio.DefaultAudioSink$e;
import com.google.android.exoplayer2.mediacodec.e;
import com.google.android.exoplayer2.mediacodec.c$b;
import java.util.ArrayList;
import com.google.android.exoplayer2.z;
import com.google.android.exoplayer2.audio.a;
import android.os.Handler;
import com.google.android.exoplayer2.mediacodec.b;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class ek8 implements mgm
{
    public final Context a;
    public final b b;
    public nv8 c;
    
    public ek8(final Context a) {
        this.a = a;
        this.b = new b();
        this.c = nv8.G0;
    }
    
    public final z[] a(final Handler handler, final w3x w3x, final a a, final vjs vjs, final fah fah) {
        final ArrayList list = new ArrayList();
        list.add(new nsg(this.a, (c$b)this.b, (e)this.c, handler, w3x));
        final Context a2 = this.a;
        final DefaultAudioSink$e defaultAudioSink$e = new DefaultAudioSink$e();
        final Intent registerReceiver = a2.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        final int a3 = rnw.a;
        final int n = 1;
        boolean b = false;
        Label_0123: {
            if (a3 >= 17) {
                final String c = rnw.c;
                if ("Amazon".equals(c) || "Xiaomi".equals(c)) {
                    b = true;
                    break Label_0123;
                }
            }
            b = false;
        }
        uy0 a4 = null;
        Label_0263: {
            if (b && Settings$Global.getInt(a2.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                a4 = uy0.d;
            }
            else {
                Label_0213: {
                    if (a3 >= 29) {
                        if (!rnw.G(a2)) {
                            int n2;
                            if (a3 >= 23 && a2.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                n2 = n;
                            }
                            else {
                                n2 = 0;
                            }
                            if (n2 == 0) {
                                break Label_0213;
                            }
                        }
                        a4 = new uy0(uy0.a.a(), 8);
                        break Label_0263;
                    }
                }
                if (registerReceiver != null && registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
                    a4 = new uy0(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
                }
                else {
                    a4 = uy0.c;
                }
            }
        }
        Objects.requireNonNull(a4);
        defaultAudioSink$e.a = a4;
        defaultAudioSink$e.c = false;
        defaultAudioSink$e.d = false;
        defaultAudioSink$e.e = 0;
        if (defaultAudioSink$e.b == null) {
            defaultAudioSink$e.b = new DefaultAudioSink$g(new AudioProcessor[0]);
        }
        list.add(new g(this.a, (c$b)this.b, (e)this.c, handler, a, (AudioSink)new DefaultAudioSink(defaultAudioSink$e)));
        list.add(new eks(vjs, handler.getLooper()));
        final Looper looper = handler.getLooper();
        final e6 e6 = (e6)this;
        for (int i = 0; i < e6.d; ++i) {
            list.add(new hah(fah, looper));
        }
        list.add(new ld3());
        return list.toArray(new z[0]);
    }
}
