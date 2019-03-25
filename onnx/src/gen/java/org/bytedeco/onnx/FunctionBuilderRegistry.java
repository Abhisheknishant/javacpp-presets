// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class FunctionBuilderRegistry extends IFunctionBuilderRegistry {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FunctionBuilderRegistry(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FunctionBuilderRegistry(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FunctionBuilderRegistry position(long position) {
        return (FunctionBuilderRegistry)super.position(position);
    }

  public FunctionBuilderRegistry() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @ByVal Status Register(@Const @ByRef FunctionBuilder function_builder);

  // Get functions for specific domain.

  public native @Const FunctionProto GetFunction(
        @StdString BytePointer func_name,
        int maxInclusiveVersion,
        @StdString BytePointer domain/*=ONNX_DOMAIN*/);
  public native @Const FunctionProto GetFunction(
        @StdString BytePointer func_name,
        int maxInclusiveVersion);
  public native @Const FunctionProto GetFunction(
        @StdString String func_name,
        int maxInclusiveVersion,
        @StdString String domain/*=ONNX_DOMAIN*/);
  public native @Const FunctionProto GetFunction(
        @StdString String func_name,
        int maxInclusiveVersion);

  public static native @ByRef FunctionBuilderRegistry OnnxInstance();
}