INSERT INTO public.properties(
    id,
    application,
    profile,
    "key",
    value,
    created_at,
    updated_at
)
VALUES(
    1,
    'kotlin-microservice-general',
    'dev',
    'kotlin.microservice.eureka.client.defaultZone',
    'localhost:8761',
    now(),
    now()
);
