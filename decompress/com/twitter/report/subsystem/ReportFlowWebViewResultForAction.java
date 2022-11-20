// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.report.subsystem;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@flp
@Metadata(bv = {}, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0017\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f" }, d2 = { "Lcom/twitter/report/subsystem/ReportFlowWebViewResultForAction;", "Lcom/twitter/report/subsystem/ReportFlowWebViewResult;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "component1", "result", "copy", "", "toString", "hashCode", "", "other", "", "equals", "I", "getResult", "()I", "<init>", "(I)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(IILhlp;)V", "Companion", "$serializer", "subsystem.tfa.report-flow.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class ReportFlowWebViewResultForAction extends ReportFlowWebViewResult
{
    public static final ReportFlowWebViewResultForAction.ReportFlowWebViewResultForAction$Companion Companion;
    private final int result;
    
    static {
        Companion = new ReportFlowWebViewResultForAction.ReportFlowWebViewResultForAction$Companion();
    }
    
    public ReportFlowWebViewResultForAction(final int result) {
        super((rf8)null);
        this.result = result;
    }
    
    public ReportFlowWebViewResultForAction(final int n, final int result, final hlp hlp) {
        if (0x1 == (n & 0x1)) {
            super(n, (hlp)null);
            this.result = result;
            return;
        }
        blz.a0(n, 1, $serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public static ReportFlowWebViewResultForAction copy$default(final ReportFlowWebViewResultForAction reportFlowWebViewResultForAction, int result, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            result = reportFlowWebViewResultForAction.result;
        }
        return reportFlowWebViewResultForAction.copy(result);
    }
    
    public static final void write$Self(final ReportFlowWebViewResultForAction reportFlowWebViewResultForAction, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)reportFlowWebViewResultForAction, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        ReportFlowWebViewResult.write$Self((ReportFlowWebViewResult)reportFlowWebViewResultForAction, xc6, serialDescriptor);
        xc6.Q(serialDescriptor, 0, reportFlowWebViewResultForAction.result);
    }
    
    public final int component1() {
        return this.result;
    }
    
    public final ReportFlowWebViewResultForAction copy(final int n) {
        return new ReportFlowWebViewResultForAction(n);
    }
    
    public boolean equals(final Object o) {
        return this == o || (o instanceof ReportFlowWebViewResultForAction && this.result == ((ReportFlowWebViewResultForAction)o).result);
    }
    
    public final int getResult() {
        return this.result;
    }
    
    public int hashCode() {
        return this.result;
    }
    
    public String toString() {
        return ze.G("ReportFlowWebViewResultForAction(result=", this.result, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/report/subsystem/ReportFlowWebViewResultForAction.$serializer", "Leyb;", "Lcom/twitter/report/subsystem/ReportFlowWebViewResultForAction;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lfzv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.report-flow.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements eyb<ReportFlowWebViewResultForAction>
    {
        public static final $serializer INSTANCE;
        public static final SerialDescriptor descriptor;
        
        static {
            final tok descriptor2 = new tok("com.twitter.report.subsystem.ReportFlowWebViewResultForAction", (eyb)(INSTANCE = new $serializer()), 1);
            descriptor2.k("result", false);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)ktd.a };
        }
        
        public ReportFlowWebViewResultForAction deserialize(final Decoder decoder) {
            czd.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final vc6 c = decoder.c(descriptor);
            c.p();
            int i = 1;
            int n = 0;
            int j = 0;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        throw new UnknownFieldException(o);
                    }
                    j = c.j(descriptor, 0);
                    n |= 0x1;
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new ReportFlowWebViewResultForAction(n, j, null);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final ReportFlowWebViewResultForAction reportFlowWebViewResultForAction) {
            czd.f((Object)encoder, "encoder");
            czd.f((Object)reportFlowWebViewResultForAction, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final xc6 c = encoder.c(descriptor);
            ReportFlowWebViewResultForAction.write$Self(reportFlowWebViewResultForAction, c, descriptor);
            c.d(descriptor);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object o) {
            this.serialize(encoder, (ReportFlowWebViewResultForAction)o);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])wiy.K0;
        }
    }
}
