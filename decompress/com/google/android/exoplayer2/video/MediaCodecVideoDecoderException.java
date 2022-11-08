// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.video;

import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.d;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;

public class MediaCodecVideoDecoderException extends MediaCodecDecoderException
{
    public MediaCodecVideoDecoderException(final Throwable t, final d d, final Surface surface) {
        super(t, d);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
