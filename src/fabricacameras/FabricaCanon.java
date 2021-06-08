package fabricacameras;

/**
 *
 * @author Fabricio
 */
public class FabricaCanon implements IFabricaDeCameras{
    @Override
    public ICameraFullFrame criarCameraFullFrame(){
        return new D5MarkIII();
    }
    
    @Override
    public ICameraCrop criarCameraCrop(){
        return new T8i();
    }
}
