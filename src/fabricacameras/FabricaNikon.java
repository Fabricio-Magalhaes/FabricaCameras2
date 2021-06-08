package fabricacameras;

/**
 *
 * @author Fabricio
 */
public class FabricaNikon implements IFabricaDeCameras{
    @Override
    public ICameraFullFrame criarCameraFullFrame() {
        return new D650(); 
    }

    @Override
    public ICameraCrop criarCameraCrop() {
        return new D3500();
    }
}