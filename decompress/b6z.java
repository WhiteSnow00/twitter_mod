import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b6z implements p4j<vgz>
{
    public static final hwa A;
    public static final hwa B;
    public static final hwa C;
    public static final hwa D;
    public static final hwa E;
    public static final hwa F;
    public static final hwa G;
    public static final hwa H;
    public static final hwa I;
    public static final hwa J;
    public static final hwa K;
    public static final hwa L;
    public static final hwa M;
    public static final hwa N;
    public static final hwa O;
    public static final hwa P;
    public static final hwa Q;
    public static final hwa R;
    public static final hwa S;
    public static final hwa T;
    public static final hwa U;
    public static final hwa V;
    public static final hwa W;
    public static final hwa X;
    public static final hwa Y;
    public static final hwa Z;
    public static final b6z a;
    public static final hwa a0;
    public static final hwa b;
    public static final hwa b0;
    public static final hwa c;
    public static final hwa c0;
    public static final hwa d;
    public static final hwa d0;
    public static final hwa e;
    public static final hwa e0;
    public static final hwa f;
    public static final hwa f0;
    public static final hwa g;
    public static final hwa g0;
    public static final hwa h;
    public static final hwa i;
    public static final hwa j;
    public static final hwa k;
    public static final hwa l;
    public static final hwa m;
    public static final hwa n;
    public static final hwa o;
    public static final hwa p;
    public static final hwa q;
    public static final hwa r;
    public static final hwa s;
    public static final hwa t;
    public static final hwa u;
    public static final hwa v;
    public static final hwa w;
    public static final hwa x;
    public static final hwa y;
    public static final hwa z;
    
    static {
        a = new b6z();
        b = new hwa("systemInfo", i81.w(oqf.o((Class)ary.class, new dqy(1))), (hwa$a)null);
        c = new hwa("eventName", i81.w(oqf.o((Class)ary.class, new dqy(2))), (hwa$a)null);
        d = new hwa("isThickClient", i81.w(oqf.o((Class)ary.class, new dqy(37))), (hwa$a)null);
        e = new hwa("clientType", i81.w(oqf.o((Class)ary.class, new dqy(61))), (hwa$a)null);
        f = new hwa("modelDownloadLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(3))), (hwa$a)null);
        g = new hwa("customModelLoadLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(20))), (hwa$a)null);
        h = new hwa("customModelInferenceLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(4))), (hwa$a)null);
        i = new hwa("customModelCreateLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(29))), (hwa$a)null);
        j = new hwa("onDeviceFaceDetectionLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(5))), (hwa$a)null);
        k = new hwa("onDeviceFaceLoadLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(59))), (hwa$a)null);
        l = new hwa("onDeviceTextDetectionLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(6))), (hwa$a)null);
        m = new hwa("onDeviceBarcodeDetectionLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(7))), (hwa$a)null);
        n = new hwa("onDeviceBarcodeLoadLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(58))), (hwa$a)null);
        o = new hwa("onDeviceImageLabelCreateLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(48))), (hwa$a)null);
        p = new hwa("onDeviceImageLabelLoadLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(49))), (hwa$a)null);
        q = new hwa("onDeviceImageLabelDetectionLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(18))), (hwa$a)null);
        r = new hwa("onDeviceObjectCreateLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(26))), (hwa$a)null);
        s = new hwa("onDeviceObjectLoadLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(27))), (hwa$a)null);
        t = new hwa("onDeviceObjectInferenceLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(28))), (hwa$a)null);
        u = new hwa("onDevicePoseDetectionLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(44))), (hwa$a)null);
        v = new hwa("onDeviceSegmentationLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(45))), (hwa$a)null);
        w = new hwa("onDeviceSmartReplyLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(19))), (hwa$a)null);
        x = new hwa("onDeviceLanguageIdentificationLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(21))), (hwa$a)null);
        y = new hwa("onDeviceTranslationLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(22))), (hwa$a)null);
        z = new hwa("cloudFaceDetectionLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(8))), (hwa$a)null);
        A = new hwa("cloudCropHintDetectionLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(9))), (hwa$a)null);
        B = new hwa("cloudDocumentTextDetectionLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(10))), (hwa$a)null);
        C = new hwa("cloudImagePropertiesDetectionLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(11))), (hwa$a)null);
        D = new hwa("cloudImageLabelDetectionLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(12))), (hwa$a)null);
        E = new hwa("cloudLandmarkDetectionLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(13))), (hwa$a)null);
        F = new hwa("cloudLogoDetectionLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(14))), (hwa$a)null);
        G = new hwa("cloudSafeSearchDetectionLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(15))), (hwa$a)null);
        H = new hwa("cloudTextDetectionLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(16))), (hwa$a)null);
        I = new hwa("cloudWebSearchDetectionLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(17))), (hwa$a)null);
        J = new hwa("automlImageLabelingCreateLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(23))), (hwa$a)null);
        K = new hwa("automlImageLabelingLoadLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(24))), (hwa$a)null);
        L = new hwa("automlImageLabelingInferenceLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(25))), (hwa$a)null);
        M = new hwa("isModelDownloadedLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(39))), (hwa$a)null);
        N = new hwa("deleteModelLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(40))), (hwa$a)null);
        O = new hwa("aggregatedAutomlImageLabelingInferenceLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(30))), (hwa$a)null);
        P = new hwa("aggregatedCustomModelInferenceLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(31))), (hwa$a)null);
        Q = new hwa("aggregatedOnDeviceFaceDetectionLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(32))), (hwa$a)null);
        R = new hwa("aggregatedOnDeviceBarcodeDetectionLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(33))), (hwa$a)null);
        S = new hwa("aggregatedOnDeviceImageLabelDetectionLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(34))), (hwa$a)null);
        T = new hwa("aggregatedOnDeviceObjectInferenceLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(35))), (hwa$a)null);
        U = new hwa("aggregatedOnDeviceTextDetectionLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(36))), (hwa$a)null);
        V = new hwa("aggregatedOnDevicePoseDetectionLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(46))), (hwa$a)null);
        W = new hwa("aggregatedOnDeviceSegmentationLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(47))), (hwa$a)null);
        X = new hwa("remoteConfigLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(42))), (hwa$a)null);
        Y = new hwa("inputImageConstructionLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(50))), (hwa$a)null);
        Z = new hwa("leakedHandleEvent", i81.w(oqf.o((Class)ary.class, new dqy(51))), (hwa$a)null);
        a0 = new hwa("cameraSourceLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(52))), (hwa$a)null);
        b0 = new hwa("imageLabelOptionalModuleLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(53))), (hwa$a)null);
        c0 = new hwa("languageIdentificationOptionalModuleLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(54))), (hwa$a)null);
        d0 = new hwa("faceDetectionOptionalModuleLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(60))), (hwa$a)null);
        e0 = new hwa("nlClassifierOptionalModuleLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(55))), (hwa$a)null);
        f0 = new hwa("nlClassifierClientLibraryLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(56))), (hwa$a)null);
        g0 = new hwa("accelerationAllowlistLogEvent", i81.w(oqf.o((Class)ary.class, new dqy(57))), (hwa$a)null);
    }
    
    public final void a(final Object o, final Object o2) throws IOException {
        final vgz vgz = (vgz)o;
        final q4j q4j = (q4j)o2;
        q4j.a(b6z.b, vgz.a);
        q4j.a(b6z.c, vgz.b);
        q4j.a(b6z.d, null);
        q4j.a(b6z.e, vgz.c);
        q4j.a(b6z.f, null);
        q4j.a(b6z.g, null);
        q4j.a(b6z.h, null);
        q4j.a(b6z.i, null);
        q4j.a(b6z.j, null);
        q4j.a(b6z.k, null);
        q4j.a(b6z.l, vgz.d);
        q4j.a(b6z.m, null);
        q4j.a(b6z.n, null);
        q4j.a(b6z.o, null);
        q4j.a(b6z.p, null);
        q4j.a(b6z.q, null);
        q4j.a(b6z.r, null);
        q4j.a(b6z.s, null);
        q4j.a(b6z.t, null);
        q4j.a(b6z.u, null);
        q4j.a(b6z.v, null);
        q4j.a(b6z.w, null);
        q4j.a(b6z.x, null);
        q4j.a(b6z.y, null);
        q4j.a(b6z.z, null);
        q4j.a(b6z.A, null);
        q4j.a(b6z.B, null);
        q4j.a(b6z.C, null);
        q4j.a(b6z.D, null);
        q4j.a(b6z.E, null);
        q4j.a(b6z.F, null);
        q4j.a(b6z.G, null);
        q4j.a(b6z.H, null);
        q4j.a(b6z.I, null);
        q4j.a(b6z.J, null);
        q4j.a(b6z.K, null);
        q4j.a(b6z.L, null);
        q4j.a(b6z.M, null);
        q4j.a(b6z.N, null);
        q4j.a(b6z.O, null);
        q4j.a(b6z.P, null);
        q4j.a(b6z.Q, null);
        q4j.a(b6z.R, null);
        q4j.a(b6z.S, null);
        q4j.a(b6z.T, null);
        q4j.a(b6z.U, vgz.e);
        q4j.a(b6z.V, null);
        q4j.a(b6z.W, null);
        q4j.a(b6z.X, null);
        q4j.a(b6z.Y, null);
        q4j.a(b6z.Z, null);
        q4j.a(b6z.a0, null);
        q4j.a(b6z.b0, null);
        q4j.a(b6z.c0, null);
        q4j.a(b6z.d0, null);
        q4j.a(b6z.e0, null);
        q4j.a(b6z.f0, null);
        q4j.a(b6z.g0, null);
    }
}
