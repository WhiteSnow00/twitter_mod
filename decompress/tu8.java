import android.os.HandlerThread;
import com.google.android.exoplayer2.mediacodec.a;
import tv.periscope.android.api.PsAudioSpaceParticipantsResponse;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tu8 implements hw1, wzr
{
    public static final tu8 G0;
    public static final tu8 H0;
    public static final tu8 I0;
    public static final tu8 J0;
    public final int F0;
    
    static {
        G0 = new tu8(0);
        H0 = new tu8(1);
        I0 = new tu8(2);
        J0 = new tu8(3);
    }
    
    public tu8(final int f0) {
        this.F0 = f0;
    }
    
    public Object b(final Object o, final Object o2) {
        switch (this.F0) {
            default: {
                return new zvj((Object)o, (Object)o2);
            }
            case 2: {
                final v01 v01 = (v01)o;
                final PsAudioSpaceParticipantsResponse psAudioSpaceParticipantsResponse = (PsAudioSpaceParticipantsResponse)o2;
                final n7n.n7n$c companion = n7n.Companion;
                e0e.f((Object)v01, "audioSpace");
                e0e.f((Object)psAudioSpaceParticipantsResponse, "participants");
                awj awj;
                if (vjo.u()) {
                    final x21 c = v01.c;
                    final z21 b = v01.b;
                    e0e.c((Object)b);
                    awj = new awj((Object)c, (Object)b);
                }
                else {
                    awj = new awj((Object)v01.c, (Object)dnl.t(psAudioSpaceParticipantsResponse.getParticipants()));
                }
                return awj;
            }
            case 1: {
                return new zvj((Object)o, (Object)o2);
            }
            case 0: {
                return new zvj((Object)o, (Object)o2);
            }
        }
    }
    
    public Object get() {
        return new HandlerThread(a.m(this.F0, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }
}
