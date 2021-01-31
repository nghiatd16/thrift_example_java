namespace java com.vng.zmd.zviettimes.thrift

typedef i32 int
service MultiplicationService
{
    int multiply(1:int n1, 2:int n2),
}